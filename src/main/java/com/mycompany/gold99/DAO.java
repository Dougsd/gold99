package com.mycompany.gold99;
import java.sql.*;
import java.util.UUID;
import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class DAO {
    private final String URL = "jdbc:postgresql://localhost:5432/GOLDDB";
    private final String USER = "postgres";
    private final String PASSWORD = "admin";
    
    public void inserirCliente(Cliente cliente) {
        String sql = "";
        
        if (buscacliente(cliente)== null){
            sql = "INSERT INTO public.clientes (id,nome,celular,idcc) VALUES (?,?,?,?)";
            try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
                 PreparedStatement stmt = conn.prepareStatement(sql)) {
                String IDCLI = UUID.randomUUID().toString();
                String IDCC = UUID.randomUUID().toString();
                stmt.setString(1, IDCLI);
                stmt.setString(2, cliente.getNomecliente().toUpperCase());
                stmt.setString(3, cliente.getCelular());
                stmt.setString(4, IDCC);
                cliente.setIdcliente(IDCLI);
                cliente.setIdCc(IDCC);
                criaCC(cliente);
                int rowsInserted = stmt.executeUpdate();
                if (rowsInserted > 0) {
                    System.out.println("Cliente inserido com sucesso!");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }else{
            sql = "UPDATE public.clientes SET nome = ?, celular = ? WHERE id = ?";
            try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
                 PreparedStatement stmt = conn.prepareStatement(sql)) {

                stmt.setString(1, cliente.getNomecliente().toUpperCase());
                stmt.setString(2, cliente.getCelular());
                stmt.setString(3, cliente.getIdcliente()); 

                int rowsUpdated = stmt.executeUpdate();
                if (rowsUpdated > 0) {
                    System.out.println("Cliente atualizado com sucesso!");
                } else {
                    System.out.println("Nenhum cliente foi atualizado. Verifique o ID.");
                }
            } catch (SQLException e) {
            }

        }
    }
    
    public Cliente buscacliente(Cliente cliente){

        String sql = "SELECT id, nome, celular, idcc FROM public.clientes WHERE nome = ?";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, cliente.getNomecliente().toUpperCase());

            ResultSet rs = stmt.executeQuery();
            if (rs.next()){
                cliente.setIdcliente(rs.getString("id"));
                cliente.setIdCc(rs.getString("idcc"));
                
                return cliente;
            }else{
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;   
    }
    
    public void updatEstoque(Estoque estoque){
        
        String sql = "UPDATE public.estoque SET gramas = ?, customedio = ?";
            try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
                 PreparedStatement stmt = conn.prepareStatement(sql)) {

                stmt.setFloat(1, estoque.getGramas());
                stmt.setFloat(2, estoque.getCcustoMedio());
                
                int rowsUpdated = stmt.executeUpdate();
                if (rowsUpdated > 0) {
                    System.out.println("Estoque atualizado com sucesso!");
                } else {
                    System.out.println("Estoque nao foi atualizado.");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
       
    }
    
    public Estoque getEstoque(){
        Estoque estoque = new Estoque(0,0);
        String sql = "SELECT * FROM public.estoque";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            ResultSet rs = stmt.executeQuery();
            if (rs.next()){
                estoque.setGramas(rs.getFloat(1));
                estoque.setCcustoMedio(rs.getFloat(2));
                return estoque;
            }else{
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public void criaCC(Cliente cliente){
        ContaCorrente conta = new ContaCorrente(cliente.getIdCc(),cliente.getIdcliente(),0,cliente.getNomecliente());
        String sql = "INSERT INTO public.contacorrente(id, idcliente, nomecliente, saldo)VALUES (?, ?, ?, ?)";
        
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
                 PreparedStatement stmt = conn.prepareStatement(sql)) {

                stmt.setString(1, conta.getIDCC());
                stmt.setString(2, conta.getIDCliente());
                stmt.setString(3, conta.getNomeCliente().toUpperCase());
                stmt.setDouble(4, conta.getSaldo());

                int rowsInserted = stmt.executeUpdate();
                if (rowsInserted > 0) {
                    System.out.println("Conta Corrente cadastrada com sucesso!");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
    }
    
    public void NovoLanc(Lancamentos lanc){
        
        String sql = "INSERT INTO public.lancamentos(idcc, idcliente, tipoop, valor, description, data ,id) VALUES (?, ?, ?, ?, ?, ?,?)";
        
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
                 PreparedStatement stmt = conn.prepareStatement(sql)) {
                 lanc.setId(UUID.randomUUID().toString());
                stmt.setString(1, lanc.getIDCC());
                stmt.setString(2, lanc.getIdcliente());
                stmt.setString(3, lanc.getTipoOP());
                stmt.setFloat(4, lanc.getValor());
                stmt.setString(5, lanc.getDescricao());
                stmt.setDate(6, lanc.getData()); 
                stmt.setString(7, lanc.getId());
                
                int rowsInserted = stmt.executeUpdate();
                if (rowsInserted > 0) {
                    System.out.println("Lancou OK!!");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
    }
    
    public void EstornaLanc(Lancamentos lanc){
       String sql = "DELETE FROM public.lancamentos WHERE id = ?";
       try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, lanc.getId());
            //stmt.setDate(3, lanc.getData());
            //stmt.setFloat(2, lanc.getValor());
            //stmt.
            int rowsDeleted = stmt.executeUpdate(); 

            if (rowsDeleted > 0) {
                System.out.println("Lançamento estornado com sucesso!");
            } else {
                System.out.println("Nenhum lançamento encontrado para estorno.");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
         
    }
    
    public List<Object[]> Historyc(String idcliente, String idcc){
        List<Object[]> historico = new ArrayList<>();
        
        String sql = "SELECT * FROM public.lancamentos WHERE idcliente = ? AND idcc = ?";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, idcliente);
            stmt.setString(2, idcc);

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    historico.add(new Object[]{rs.getDate("data"), rs.getDouble("valor"), rs.getString("tipoop"), rs.getString("description"),rs.getString("id")});
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return historico;
    }     
    
    public float getSaldo(String idcliente, String idcc){
        float saldo = 0;
        
        String sql = "SELECT idcc, idcliente, tipoop, valor, description, data FROM public.lancamentos WHERE idcliente = ? AND idcc = ?";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, idcliente);
            stmt.setString(2, idcc);

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {                
                    if ("C".equals(rs.getString("tipoop")) || "c".equals(rs.getString("tipoop"))){
                        //System.out.println("Creditou->"+rs.getFloat("valor"));
                       
                        saldo = saldo + rs.getFloat("valor");
                        //System.out.println("Saldo atual->"+saldo);
                    }else{
                         //System.out.println("Debitou->"+rs.getFloat("valor"));
                        
                        saldo = saldo - rs.getFloat("valor");
                        //System.out.println("Saldo atual->"+saldo);
                    }   
                }
                
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return saldo;
    }
    
    public List<Object[]> GetClientes(String nome) {
        // Consulta SQL dinâmica com LIKE para buscar o nome do cliente
        String sql = "SELECT * FROM public.clientes WHERE nome LIKE ?";
        List<Object[]> dados = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql)) {
             
            // Definindo o parâmetro da consulta com o texto digitado, com % para correspondência parcial
            stmt.setString(1, "%" + nome + "%");

            try (ResultSet rs = stmt.executeQuery()) {
                
                while (rs.next()) {
                    String id = rs.getString("id");
                    String nomeCliente = rs.getString("nome");
                    String celular = rs.getString("celular");
                    String idcc = rs.getString("idcc");
                    // Adiciona cada linha ao ArrayList
                    dados.add(new Object[]{nomeCliente, celular, id, idcc});
                }
                
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dados;
    }

    public List<Object[]> GetAllClientes() {
        // Consulta SQL dinâmica com LIKE para buscar o nome do cliente
        String sql = "SELECT * FROM public.clientes";
        List<Object[]> dados = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            try (ResultSet rs = stmt.executeQuery()) {
                
                while (rs.next()) {
                    String id = rs.getString("id");
                    String nomeCliente = rs.getString("nome");
                    String celular = rs.getString("celular");
                    String idcc = rs.getString("idcc");
                    // Adiciona cada linha ao ArrayList
                    dados.add(new Object[]{nomeCliente, celular, id, idcc});
                }
                
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dados;
    }

    public void vender(Vendas venda){
        String sql = "INSERT INTO public.vendas(id, date, qtd, lucro) VALUES (?, ?, ?, ?)";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
                 PreparedStatement stmt = conn.prepareStatement(sql)) {

                stmt.setString(1, UUID.randomUUID().toString());
                stmt.setDate(2, venda.getData());
                stmt.setFloat(3, venda.getQtd());
                stmt.setFloat(4, venda.getLucro());

                int rowsInserted = stmt.executeUpdate();
                if (rowsInserted > 0) {
                    System.out.println("Venda com sucesso!");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
    }
    
    public List<Object[]> HistoryVendas(){
        List<Object[]> historico = new ArrayList<>();
        
        String sql = "SELECT * FROM public.vendas";

        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    historico.add(new Object[]{rs.getString("id"), rs.getDate("date"), rs.getFloat("qtd"), rs.getFloat("lucro")});
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return historico;
    }  
    
    public float getLucroMes(Date date){
        DAO dao = new DAO();
        List<Object[]> dados = dao.getVendasMes(date);
        float valor = 0;
        for (Object[] linha : dados) {     
            valor += ((Number) linha[3]).floatValue();
        }
        return valor;
    }
    
    public List<Object[]> getVendasMes(Date date){
        String sql = "SELECT * FROM public.vendas WHERE date<=? AND date >=?";
        
        LocalDate localDate = date.toLocalDate();
        LocalDate primeiroDia = localDate.with(TemporalAdjusters.firstDayOfMonth());
        Date inicio = Date.valueOf(primeiroDia);
        LocalDate ultimoDia = localDate.with(TemporalAdjusters.lastDayOfMonth()); // Último dia do mês
        Date fim = Date.valueOf(ultimoDia);
          
        List<Object[]> historico = new ArrayList<>();
        
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setDate(2,inicio);
            stmt.setDate(1, fim);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()){
                historico.add(new Object[]{rs.getString("id"), rs.getDate("date"), rs.getFloat("qtd"), rs.getFloat("lucro")});
                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return historico;
    }
    
    public void EstornaVenda(Vendas venda){
        String sql = "DELETE FROM public.vendas WHERE id = ?";
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, venda.getId());
          
            int rowsDeleted = stmt.executeUpdate(); 

            if (rowsDeleted > 0) {
                System.out.println("Venda estornada com sucesso!");
            } else {
                System.out.println("Nenhuma venda encontrado para estorno.");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}