insert into user (firstname, lastname, email, password, enable, role, phone) values ('test 1', 'DUPOND', 'admin@gmail.com', 'admin', true, 'ROLE_ADMIN', '0211334455');
insert into user (firstname, lastname, email, password, enable, role, phone) values ('test 2', 'DUPOND', 'user1@gmail.com', 'user', true, 'ROLE_USER', '0244556633');
insert into user (firstname, lastname, email, password, enable, role, phone) values ('test 3', 'DUPOND', 'user2@gmail.com', 'user', true, 'ROLE_USER', '0288776655');

insert into place (name) values ('Rennes');
insert into place (name) values ('Saint-Malo');
insert into place (name) values ('Brest');
insert into place (name) values ('Mont Blanc');

insert into sport (name) values ('Vélo');
insert into sport (name) values ('Voile');
insert into sport (name) values ('Surf');
insert into sport (name) values ('Ski');
insert into sport (name) values ('Randonnée');

insert into level (name, sport_id, rank) values ('noob', 1, 1);
insert into level (name, sport_id, rank) values ('medium', 1, 2);
insert into level (name, sport_id, rank) values ('expert', 1, 3);
insert into level (name, sport_id, rank) values ('ourson', 4, 2);
insert into level (name, sport_id, rank) values ('piou piou', 4, 1);
insert into level (name, sport_id, rank) values ('flocon', 4, 3);

insert into activity (level_id, user_id) values (2, 1);
insert into activity (level_id, user_id) values (3, 1);