insert into address(created_by, created_time, is_deleted, updated_by, updated_time, zip, state, town)
VALUES (1, '2022-01-08 00:00:00', false, 1, '2022-01-08 00:00:00', 60013, 'ILLINOIS', 'Chicago'),
        (1, '2022-01-10 00:00:00', false, 1, '2022-01-10 00:00:00', 40041, 'COLORADO', 'Denver');

insert into racer(created_by, created_time, is_deleted, updated_by, updated_time, age, bike_model,
                  displacement, district, gender, is_enabled, first_name, last_name, password, race_class, user_name)
VALUES (1, '2021-01-05 00:00:00', false, 1, '2021-01-05 00:00:00', 28, 'KTM', 300, 17, 'MALE', TRUE,'Vasya', 'Pupkin',
        '$2a$10$nAB5j9G1c3JHgg7qzhiIXO7cqqr5oJ3LXRNQJKssDUwHXzDGUztNK', 'Gold', 'vasya1');


insert into contact_info (created_by, created_time, is_deleted, updated_by, updated_time,
                          email, phone, address_id)
VALUES (1, '2021-01-05 00:00:00', false, 1, '2021-01-05 00:00:00',
        'vasya@gmail.com', 5551234567,1);

-- -- -- Abc1