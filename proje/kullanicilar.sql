toc.dat                                                                                             0000600 0004000 0002000 00000003061 14236202717 0014443 0                                                                                                    ustar 00postgres                        postgres                        0000000 0000000                                                                                                                                                                        PGDMP                   	        z            Kullanicilar    14.2    14.2     �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                      false         �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                      false         �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                      false         �           1262    16394    Kullanicilar    DATABASE     k   CREATE DATABASE "Kullanicilar" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'Turkish_Turkey.1254';
    DROP DATABASE "Kullanicilar";
                postgres    false         �            1259    16395    kullanicilar    TABLE     T   CREATE TABLE public.kullanicilar (
    id text NOT NULL,
    sifre text NOT NULL
);
     DROP TABLE public.kullanicilar;
       public         heap    postgres    false         �          0    16395    kullanicilar 
   TABLE DATA           1   COPY public.kullanicilar (id, sifre) FROM stdin;
    public          postgres    false    209       3304.dat \           2606    16401    kullanicilar kullanicilar_pkey 
   CONSTRAINT     \   ALTER TABLE ONLY public.kullanicilar
    ADD CONSTRAINT kullanicilar_pkey PRIMARY KEY (id);
 H   ALTER TABLE ONLY public.kullanicilar DROP CONSTRAINT kullanicilar_pkey;
       public            postgres    false    209                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       3304.dat                                                                                            0000600 0004000 0002000 00000000054 14236202717 0014246 0                                                                                                    ustar 00postgres                        postgres                        0000000 0000000                                                                                                                                                                        admin	123
vysyldrm	123456
test	test123
\.


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    restore.sql                                                                                         0000600 0004000 0002000 00000003643 14236202717 0015376 0                                                                                                    ustar 00postgres                        postgres                        0000000 0000000                                                                                                                                                                        --
-- NOTE:
--
-- File paths need to be edited. Search for $$PATH$$ and
-- replace it with the path to the directory containing
-- the extracted data files.
--
--
-- PostgreSQL database dump
--

-- Dumped from database version 14.2
-- Dumped by pg_dump version 14.2

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

DROP DATABASE "Kullanicilar";
--
-- Name: Kullanicilar; Type: DATABASE; Schema: -; Owner: postgres
--

CREATE DATABASE "Kullanicilar" WITH TEMPLATE = template0 ENCODING = 'UTF8' LOCALE = 'Turkish_Turkey.1254';


ALTER DATABASE "Kullanicilar" OWNER TO postgres;

\connect "Kullanicilar"

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
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
-- Name: kullanicilar; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.kullanicilar (
    id text NOT NULL,
    sifre text NOT NULL
);


ALTER TABLE public.kullanicilar OWNER TO postgres;

--
-- Data for Name: kullanicilar; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY public.kullanicilar (id, sifre) FROM stdin;
\.
COPY public.kullanicilar (id, sifre) FROM '$$PATH$$/3304.dat';

--
-- Name: kullanicilar kullanicilar_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.kullanicilar
    ADD CONSTRAINT kullanicilar_pkey PRIMARY KEY (id);


--
-- PostgreSQL database dump complete
--

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             