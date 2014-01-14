-- You can use this file to load seed data into the database using SQL statements
insert into CHARACTER (ID, NAME, PLAYER, CAMPAIGN) values (0, 'Scar', 'Allen', 'Pandora'), (1, 'Mikey', 'Michael', 'Pandora'), (2, 'Angel Dust', 'Susan', 'Penumbra')
insert into ATTRIBUTE (ID, NAME, SHORTNAME, DESCRIPTION) values (0, 'Intelligence Quotient', 'IQ', ''), (1, 'Mental Endurance', 'ME',  ''), (2, 'Mental Affinity', 'MA',  ''), (3, 'Physical Endurance', 'PE', ''), (4, 'Physical Prowess', 'PP',  ''), (5, 'Physical Beauty', 'PB',  ''), (6, 'Physical Strength', 'PS', ''), (7, 'Speed', 'SPD', '');
insert into CHARACTER_ATTRIBUTE (CHARACTER_ID, ATTRIBUTE_ID, ATTRIBUTE_VALUE) values (0, 0, 12), (0, 1, 13), ( 0, 2, 14), (0, 3, 15), ( 0, 4, 16), (0, 5, 16), (0, 6, 17), ( 0, 7, 18);
