--
-- PostgreSQL database dump
--

SET statement_timeout = 0;
SET lock_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;

--
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner:
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner:
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET search_path = public, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- Name: albums; Type: TABLE; Schema: public; Owner: photoalbum; Tablespace:
--

CREATE TABLE albums (
    album_id integer NOT NULL,
    title character varying(50) NOT NULL,
    created_date date NOT NULL,
    cover_photo_id integer NOT NULL
);


ALTER TABLE albums OWNER TO photoalbum;

--
-- Name: albums_album_id_seq; Type: SEQUENCE; Schema: public; Owner: photoalbum
--

CREATE SEQUENCE albums_album_id_seq
    START WITH 3
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE albums_album_id_seq OWNER TO photoalbum;

--
-- Name: albums_album_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: photoalbum
--

ALTER SEQUENCE albums_album_id_seq OWNED BY albums.album_id;


--
-- Name: photos; Type: TABLE; Schema: public; Owner: photoalbum; Tablespace:
--

CREATE TABLE photos (
    photo_id integer NOT NULL,
    title character varying(50) NOT NULL,
    created_date date NOT NULL,
    file_path character varying(100) NOT NULL,
    album_id integer NOT NULL
);


ALTER TABLE photos OWNER TO photoalbum;

--
-- Name: photos_photo_id_seq; Type: SEQUENCE; Schema: public; Owner: photoalbum
--

CREATE SEQUENCE photos_photo_id_seq
    START WITH 6
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE photos_photo_id_seq OWNER TO photoalbum;

--
-- Name: photos_photo_id_seq; Type: SEQUENCE OWNED BY; Schema: public; Owner: photoalbum
--

ALTER SEQUENCE photos_photo_id_seq OWNED BY photos.photo_id;


--
-- Name: album_id; Type: DEFAULT; Schema: public; Owner: photoalbum
--

ALTER TABLE ONLY albums ALTER COLUMN album_id SET DEFAULT nextval('albums_album_id_seq'::regclass);


--
-- Name: photo_id; Type: DEFAULT; Schema: public; Owner: photoalbum
--

ALTER TABLE ONLY photos ALTER COLUMN photo_id SET DEFAULT nextval('photos_photo_id_seq'::regclass);


--
-- Name: albums_pkey; Type: CONSTRAINT; Schema: public; Owner: photoalbum; Tablespace:
--

ALTER TABLE ONLY albums
    ADD CONSTRAINT albums_pkey PRIMARY KEY (album_id);


--
-- Name: photos_pkey; Type: CONSTRAINT; Schema: public; Owner: photoalbum; Tablespace:
--

ALTER TABLE ONLY photos
    ADD CONSTRAINT photos_pkey PRIMARY KEY (photo_id);


--
-- Name: public; Type: ACL; Schema: -; Owner: photoalbum
--

REVOKE ALL ON SCHEMA public FROM PUBLIC;
REVOKE ALL ON SCHEMA public FROM photoalbum;
GRANT ALL ON SCHEMA public TO photoalbum;
GRANT ALL ON SCHEMA public TO PUBLIC;


--
-- PostgreSQL database dump complete
--
