insert into user (email, firstname, lastname, phone) values ('test1@gmail.com', 'test 1', 'DUPOND', '0211334455');
insert into user (email, firstname, lastname, phone) values ('test2@gmail.com', 'test 2', 'DUPOND', '0244556633');
insert into user (email, firstname, lastname, phone) values ('test3@gmail.com', 'test 3', 'DUPOND', '0288776655');

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