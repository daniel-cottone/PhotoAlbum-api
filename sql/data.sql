--
-- PostgreSQL database dump
--

SET statement_timeout = 0;
SET lock_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;

SET search_path = public, pg_catalog;

--
-- Data for Name: albums; Type: TABLE DATA; Schema: public; Owner: photoalbum
--

COPY albums (album_id, title, created_date, cover_photo_id) FROM stdin;
1	My first album!	2015-06-02	1
2	Vacation 2015	2015-06-02	4
\.


--
-- Name: albums_album_id_seq; Type: SEQUENCE SET; Schema: public; Owner: photoalbum
--

SELECT pg_catalog.setval('albums_album_id_seq', 1, false);


--
-- Data for Name: photos; Type: TABLE DATA; Schema: public; Owner: photoalbum
--

COPY photos (photo_id, title, created_date, file_path, album_id) FROM stdin;
1	just me	2015-06-02	me.png	1
2	another pic	2015-06-02	another.png	1
3	profile photo	2015-06-02	profile.png	1
4	at the beach	2015-06-02	beach.png	2
5	at the park	2015-06-02	park.png	2
\.


--
-- Name: photos_photo_id_seq; Type: SEQUENCE SET; Schema: public; Owner: photoalbum
--

SELECT pg_catalog.setval('photos_photo_id_seq', 1, false);


--
-- PostgreSQL database dump complete
--
