insert into albums(album_id, title, created_date, cover_photo_id) values(albums_seq.nextval, 'Senior Graduation', CURRENT_TIMESTAMP(), 1)
insert into albums(album_id, title, created_date, cover_photo_id) values(albums_seq.nextval, 'Spring Break Vacation', CURRENT_TIMESTAMP(), 4)

insert into photos(photo_id, title, created_date, file_path, album_id) values (photos_seq.nextval, 'just me', CURRENT_TIMESTAMP(), 'me.png', 1)
insert into photos(photo_id, title, created_date, file_path, album_id) values (photos_seq.nextval, 'another pic', CURRENT_TIMESTAMP(), 'another.png', 1)
insert into photos(photo_id, title, created_date, file_path, album_id) values (photos_seq.nextval, 'profile photo', CURRENT_TIMESTAMP(), 'profile.png', 1)
insert into photos(photo_id, title, created_date, file_path, album_id) values (photos_seq.nextval, 'at the beach', CURRENT_TIMESTAMP(), 'beach.png', 2)
insert into photos(photo_id, title, created_date, file_path, album_id) values (photos_seq.nextval, 'at the park', CURRENT_TIMESTAMP(), 'park.png', 2)
