create table game(
    id int primary key,
    start_time timestamp,
    end_time timestamp,
    winner_id int,
    status int not null,
    version int not null
);

INSERT INTO game (id, start_time, end_time, winner_id, status, version)
VALUES (1, '2023-03-25 12:00:00', '2023-03-25 13:00:00', 2, 1, 1);

INSERT INTO game (id, start_time, end_time, winner_id, status, version)
VALUES (2, '2023-03-24 15:00:00', '2023-03-24 16:00:00', NULL, 0, 1);

INSERT INTO game (id, start_time, end_time, winner_id, status, version)
VALUES (3, '2023-03-23 18:00:00', NULL, NULL, 0, 1);
