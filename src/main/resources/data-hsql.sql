insert into files(id, filename, created_date, data) values(files_seq.nextval, 'dawg.jpg', CURRENT_TIMESTAMP(), FILE_READ('src/main/resources/images/dawg.jpg'))
insert into files(id, filename, created_date, data) values(files_seq.nextval, 'pig.jpg', CURRENT_TIMESTAMP(), FILE_READ('src/main/resources/images/pig.jpg'))
insert into files(id, filename, created_date, data) values(files_seq.nextval, 'cat.jpg', CURRENT_TIMESTAMP(), FILE_READ('src/main/resources/images/cat.jpg'))
insert into albums(id, title, created_date, cover_photo_id) values(albums_seq.nextval, 'The Lads', CURRENT_TIMESTAMP(), 1)
insert into photos(id, title, created_date, file_path, album_id) values (photos_seq.nextval, 'dawg', CURRENT_TIMESTAMP(), 'dawg.jpg', albums_seq.currval)
insert into photos(id, title, created_date, file_path, album_id) values (photos_seq.nextval, 'pig', CURRENT_TIMESTAMP(), 'pig.jpg', albums_seq.currval)
insert into photos(id, title, created_date, file_path, album_id) values (photos_seq.nextval, 'cat', CURRENT_TIMESTAMP(), 'cat.jpg', albums_seq.currval)

insert into files(id, filename, created_date, data) values(files_seq.nextval, 'beach.jpg', CURRENT_TIMESTAMP(), FILE_READ('src/main/resources/images/beach.jpg'))
insert into files(id, filename, created_date, data) values(files_seq.nextval, 'park.jpg', CURRENT_TIMESTAMP(), FILE_READ('src/main/resources/images/park.jpg'))
insert into albums(id, title, created_date, cover_photo_id) values(albums_seq.nextval, 'Spring Break Vacation', CURRENT_TIMESTAMP(), 4)
insert into photos(id, title, created_date, file_path, album_id) values (photos_seq.nextval, 'beach', CURRENT_TIMESTAMP(), 'beach.jpg', albums_seq.currval)
insert into photos(id, title, created_date, file_path, album_id) values (photos_seq.nextval, 'park', CURRENT_TIMESTAMP(), 'park.jpg', albums_seq.currval)
