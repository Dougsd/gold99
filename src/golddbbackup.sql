--
-- PostgreSQL database dump
--

-- Dumped from database version 17.4
-- Dumped by pg_dump version 17.4

-- Started on 2025-03-18 17:01:25

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET transaction_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 219 (class 1259 OID 16455)
-- Name: clientes; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.clientes (
    id character varying NOT NULL,
    nome character varying,
    celular character varying,
    idcc character varying
);


ALTER TABLE public.clientes OWNER TO postgres;

--
-- TOC entry 218 (class 1259 OID 16410)
-- Name: compras; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.compras (
    id integer NOT NULL,
    "PesoSeco" double precision,
    "PesoMolhado" double precision,
    "PctTeor" double precision,
    "QtdFino" double precision,
    "ValorGrama" double precision,
    "ValorCompra" double precision,
    "Data" "char"
);


ALTER TABLE public.compras OWNER TO postgres;

--
-- TOC entry 220 (class 1259 OID 16463)
-- Name: contacorrente; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.contacorrente (
    id character varying NOT NULL,
    idcliente character varying,
    nomecliente character varying,
    saldo double precision
);


ALTER TABLE public.contacorrente OWNER TO postgres;

--
-- TOC entry 217 (class 1259 OID 16399)
-- Name: estoque; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.estoque (
    gramas numeric,
    customedio numeric
);


ALTER TABLE public.estoque OWNER TO postgres;

--
-- TOC entry 221 (class 1259 OID 16470)
-- Name: lancamentos; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.lancamentos (
    idcc character varying,
    idcliente character varying,
    tipoop "char",
    valor numeric,
    description character varying,
    data date,
    id character varying
);


ALTER TABLE public.lancamentos OWNER TO postgres;

--
-- TOC entry 222 (class 1259 OID 16492)
-- Name: vendas; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.vendas (
    id character varying,
    date date,
    qtd numeric,
    lucro numeric
);


ALTER TABLE public.vendas OWNER TO postgres;

--
-- TOC entry 4655 (class 2606 OID 16461)
-- Name: clientes clientes_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.clientes
    ADD CONSTRAINT clientes_pkey PRIMARY KEY (id);


--
-- TOC entry 4657 (class 2606 OID 16469)
-- Name: contacorrente contacorrente_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.contacorrente
    ADD CONSTRAINT contacorrente_pkey PRIMARY KEY (id);


-- Completed on 2025-03-18 17:01:26

--
-- PostgreSQL database dump complete
--

