--
-- PostgreSQL database dump
--

-- Dumped from database version 12.3 (Ubuntu 12.3-1.pgdg20.04+1)
-- Dumped by pg_dump version 12.3 (Ubuntu 12.3-1.pgdg20.04+1)

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
-- Name: heroes; Type: TABLE; Schema: public; Owner: einstein
--

CREATE TABLE public.heroes (
    id integer NOT NULL,
    name character varying,
    age integer,
    specialpower character varying,
    weakness character varying,
    squadid integer
);


ALTER TABLE public.heroes OWNER TO einstein;

--
-- Name: heroes_id_seq; Type: SEQUENCE; Schema: public; Owner: einstein
--

CREATE SEQUENCE public.heroes_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.heroes_id_seq OWNER TO einstein;

--
-- Name: heroes_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: einstein
--

ALTER SEQUENCE public.heroes_id_seq OWNED BY public.heroes.id;


--
-- Name: squads; Type: TABLE; Schema: public; Owner: einstein
--

CREATE TABLE public.squads (
    id integer NOT NULL,
    squadname character varying,
    causededicatedtofighting character varying,
    squadmemberscounter integer
);


ALTER TABLE public.squads OWNER TO einstein;

--
-- Name: squads_id_seq; Type: SEQUENCE; Schema: public; Owner: einstein
--

CREATE SEQUENCE public.squads_id_seq
    AS integer
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE public.squads_id_seq OWNER TO einstein;

--
-- Name: squads_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: einstein
--

ALTER SEQUENCE public.squads_id_seq OWNED BY public.squads.id;


--
-- Name: heroes id; Type: DEFAULT; Schema: public; Owner: einstein
--

ALTER TABLE ONLY public.heroes ALTER COLUMN id SET DEFAULT nextval('public.heroes_id_seq'::regclass);


--
-- Name: squads id; Type: DEFAULT; Schema: public; Owner: einstein
--

ALTER TABLE ONLY public.squads ALTER COLUMN id SET DEFAULT nextval('public.squads_id_seq'::regclass);


--
-- Data for Name: heroes; Type: TABLE DATA; Schema: public; Owner: einstein
--

COPY public.heroes (id, name, age, specialpower, weakness, squadid) FROM stdin;
\.


--
-- Data for Name: squads; Type: TABLE DATA; Schema: public; Owner: einstein
--

COPY public.squads (id, squadname, causededicatedtofighting, squadmemberscounter) FROM stdin;
\.


--
-- Name: heroes_id_seq; Type: SEQUENCE SET; Schema: public; Owner: einstein
--

SELECT pg_catalog.setval('public.heroes_id_seq', 31, true);


--
-- Name: squads_id_seq; Type: SEQUENCE SET; Schema: public; Owner: einstein
--

SELECT pg_catalog.setval('public.squads_id_seq', 10, true);


--
-- Name: heroes heroes_pkey; Type: CONSTRAINT; Schema: public; Owner: einstein
--

ALTER TABLE ONLY public.heroes
    ADD CONSTRAINT heroes_pkey PRIMARY KEY (id);


--
-- Name: squads squads_pkey; Type: CONSTRAINT; Schema: public; Owner: einstein
--

ALTER TABLE ONLY public.squads
    ADD CONSTRAINT squads_pkey PRIMARY KEY (id);


--
-- PostgreSQL database dump complete
--

