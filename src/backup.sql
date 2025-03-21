PGDMP  
    .                }            GOLDDB    17.4    17.4     �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                           false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                           false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                           false            �           1262    16386    GOLDDB    DATABASE     n   CREATE DATABASE "GOLDDB" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE_PROVIDER = libc LOCALE = 'pt-BR';
    DROP DATABASE "GOLDDB";
                     postgres    false                        2615    2200    public    SCHEMA        CREATE SCHEMA public;
    DROP SCHEMA public;
                     pg_database_owner    false            �           0    0    SCHEMA public    COMMENT     6   COMMENT ON SCHEMA public IS 'standard public schema';
                        pg_database_owner    false    4            �            1259    16455    clientes    TABLE     �   CREATE TABLE public.clientes (
    id character varying NOT NULL,
    nome character varying,
    celular character varying,
    idcc character varying
);
    DROP TABLE public.clientes;
       public         heap r       postgres    false    4            �            1259    16410    compras    TABLE       CREATE TABLE public.compras (
    id integer NOT NULL,
    "PesoSeco" double precision,
    "PesoMolhado" double precision,
    "PctTeor" double precision,
    "QtdFino" double precision,
    "ValorGrama" double precision,
    "ValorCompra" double precision,
    "Data" "char"
);
    DROP TABLE public.compras;
       public         heap r       postgres    false    4            �            1259    16463    contacorrente    TABLE     �   CREATE TABLE public.contacorrente (
    id character varying NOT NULL,
    idcliente character varying,
    nomecliente character varying,
    saldo double precision
);
 !   DROP TABLE public.contacorrente;
       public         heap r       postgres    false    4            �            1259    16399    estoque    TABLE     L   CREATE TABLE public.estoque (
    gramas numeric,
    customedio numeric
);
    DROP TABLE public.estoque;
       public         heap r       postgres    false    4            �            1259    16470    lancamentos    TABLE     �   CREATE TABLE public.lancamentos (
    idcc character varying,
    idcliente character varying,
    tipoop "char",
    valor numeric,
    description character varying,
    data date,
    id character varying
);
    DROP TABLE public.lancamentos;
       public         heap r       postgres    false    4            �            1259    16492    vendas    TABLE     l   CREATE TABLE public.vendas (
    id character varying,
    date date,
    qtd numeric,
    lucro numeric
);
    DROP TABLE public.vendas;
       public         heap r       postgres    false    4            �          0    16455    clientes 
   TABLE DATA                 public               postgres    false    219   �       �          0    16410    compras 
   TABLE DATA                 public               postgres    false    218   �       �          0    16463    contacorrente 
   TABLE DATA                 public               postgres    false    220   �       �          0    16399    estoque 
   TABLE DATA                 public               postgres    false    217   R       �          0    16470    lancamentos 
   TABLE DATA                 public               postgres    false    221   �       �          0    16492    vendas 
   TABLE DATA                 public               postgres    false    222   x       5           2606    16461    clientes clientes_pkey 
   CONSTRAINT     T   ALTER TABLE ONLY public.clientes
    ADD CONSTRAINT clientes_pkey PRIMARY KEY (id);
 @   ALTER TABLE ONLY public.clientes DROP CONSTRAINT clientes_pkey;
       public                 postgres    false    219            7           2606    16469     contacorrente contacorrente_pkey 
   CONSTRAINT     ^   ALTER TABLE ONLY public.contacorrente
    ADD CONSTRAINT contacorrente_pkey PRIMARY KEY (id);
 J   ALTER TABLE ONLY public.contacorrente DROP CONSTRAINT contacorrente_pkey;
       public                 postgres    false    220            �   �  x���K��F���+��R�������Ľ�-[#����w��	���?%�/�@�Z��G�sz^���6��m����|.�/��?_���ܧ���sw�d�:T�Ȥ�]�F.喥�ޞ��O�eٮ�u^^�}f/����cˆ��\j�!��؁c'�:v���=͏0	KNlĪ��d�r1gU����v��
uz�2�>�����W:��T�o�
��PhN��#FB�|�β�ɺ �g�3B����&��!����y=��0/�e>V&(�/��M�I=J*�B�Ȑ������a(��J�b>�./�� ����>:�q?�6���˸ާ庭�i�\�y��:]`��N������bc`���B�ܛG6��E�Ø�����:�{���[T�\)��~���4-۰no��|��Q�"F�h�w��|b��]�{T8'p�%�1=��#qa��UR1S bf(�cƄ��w�y}���M�y��Z=����6�nˇ��� e퇆�kd��v��1��!B� ��ڥ�7��$�!(] 5�9$� 57�IL�E��a�yz?��rކ}�����jҺk�+Ū�(��D	�?�<�Q�� �k�� ��5.�Tiw\ �x��KIE���:8�N�%��3��z�t���{�X�<L�R=�Ș�Ec���}{�.j�%|s��<-���<O�u���W�8FGG�ض�E�jiT5d�!+>i��u}z���nf      �   
   x���          �   �  x���ͫ�J������},���.�*�D��&2����Q�����w�%p��G�szZ��rU�r]������|��=�/߾��ߛz�}��?�-kJ�
�R�	��;�]�!<�P�ݶ�M�P�F@���
m�-s����p��Mm��<ȿ�����a�vߢah�%��,�,��]D'L��b�2�ɬI�sc�l;�,��Н���<����t�������t7�I�N=r,�B� q��1ΐ��� �gس�Ts�u���Ĝݴ��U��i�L�/ɷSl�]L�A�̓EC��嘢C�]F�����צ"�h]���:\wj|�}��uQ��r�A-�2nw�%��������r[m��i��-)�jBr���bb��%o����
:��i�W����q��|�k���\�{� ��-D���Tcv�9�oi�H�1X[Qt�@t��8/��
�_l��f=���<�'qux�.۪������t?a��B�5IŤgc�2�M��\?&q�qgH�J�;p�MB�r��w��{��4�Wu7������v4^*�ʓ��4KQJ뀋�z`q 6K>��ܪ�.���0���la"�
q,�m(��\���$�r�����;��%�N���^��RX��н��i�Q��M?�j[�����]�n`      �   C   x���v
Q���W((M��L�K-.�/,MUs�	uV�044г43�Q05306�3Դ��$K ���      �   �  x�ŗ�jG���{�\���OE�i�,XZee����'`����*q$�3]��ᯚ���rx��]��o���~����`��>>~��������r���YMi��T�$2�YK�g|�j��'�s���0�����M�c�l��>w�?!���gpa��eǑ���ǳ���WG]E(Xˤ>yʮ¬�Yq��?��=#��̸|�\�o7��fs�oؿJ�7��D14��M��;��8��
�R�L��8Z������Au�H|֐KTm�]�-N���X+�q��|G
K/�s�kV�s��������AP�G�B�X&���RNME�3%+�wrp��Xg����r��> :"�;a�ʁ� ���4gqZؼ<7Q��Zo���ñ��w���vs���7 {��?&�s0�	��>�&<AqԌ�Zs�'۷ ���v���i١s���l�<�i�{���JR
=��2��F���=M���s�=�|�'҂�o3#�g	FQ�48I.�'�z
�q�$UI*ODF�)�qg�2��6V��.�$�z�B��*�x�2���rK�$R���|�����T��
D�
�9aDM��S #)�1k�E뤡@ s��[0���͐9ѩd���&i��x��>���n�=n.�78�(�#Y�$�������Tm'��<C�J��D��F6AS�YFV��˩�B�"�/4�*�]���I��i�'rq<+�2�ēO
���h�)�w�Q�H;���-�B�����(��.��I{��%1����e��jA�;��E���1��i�"J���Lš<���͹n5='��t'T�!F�<bO�sB%@�R�V�{�=�g�{}Z.�Ûf�3��[�����X���p��	yB�5SaR�Fk@Stm<{nn��~�\l��������8�1���#t�T4g^c�o>i��%�No�ۤGS������9M��E(��^V���;� �U���_��������Ύ�	��¨���~�M��ɂ�ͬd��9�����
0�s��wH f��n���'�%�"�5 �SŠ�C-�չ��68�&��I<t�_�cf�X�������G�L+�&�U!�	�u����@g&�]�+���9�Z�0XdX	�E�-L|f=i����?��c��c�f䴮��$��Ό\1>�'I���?<`A�'��_S���S�2;��c�_���3s      �   
   x���         