CREATE TABLE IF NOT EXISTS BUS_INVENTORY (

    BUS_NUMBER VARCHAR(20) PRIMARY KEY,
    OPERATOR_NAME VARCHAR(50),
    DEPARTURE TIMESTAMP,
    ARRIVAL TIMESTAMP,
    SOURCE_CITY VARCHAR(50),
    DESTINATION_CITY VARCHAR(50),
    PRICE NUMERIC
);

DELETE FROM BUS_INVENTORY;
INSERT INTO BUS_INVENTORY VALUES('TN 1000', 'ABC TRAVELS', {ts '2020-07-02 19:00:00'}, {ts '2020-07-03 05:00:00'}, 'CHENNAI', 'NAMAKKAL', 550);
INSERT INTO BUS_INVENTORY VALUES('TN 1001', 'DEF TRAVELS', {ts '2020-07-02 19:30:00'}, {ts '2020-07-03 07:00:00'}, 'CHENNAI', 'SALEM', 400);
INSERT INTO BUS_INVENTORY VALUES('TN 1002', 'GHI TRAVELS', {ts '2020-07-02 20:00:00'}, {ts '2020-07-03 06:00:00'}, 'MADURAI', 'ERODE', 350);
INSERT INTO BUS_INVENTORY VALUES('TN 1003', 'JKL TRAVELS', {ts '2020-07-02 20:30:00'}, {ts '2020-07-03 06:30:00'}, 'TUTICORIN', 'TRICHY', 1100);
INSERT INTO BUS_INVENTORY VALUES('TN 1004', 'MNO TRAVELS', {ts '2020-07-02 21:00:00'}, {ts '2020-07-03 08:00:00'}, 'NAMAKKAL', 'CHENNAI', 550);
INSERT INTO BUS_INVENTORY VALUES('TN 1005', 'PQR TRAVELS', {ts '2020-07-02 21:30:00'}, {ts '2020-07-03 21:00:00'}, 'CHENNAI', 'ERODE', 300);
INSERT INTO BUS_INVENTORY VALUES('TN 1006', 'STU TRAVELS', {ts '2020-07-02 22:00:00'}, {ts '2020-07-03 12:00:00'}, 'CHENNAI', 'MADURAI', 220);
INSERT INTO BUS_INVENTORY VALUES('TN 1007', 'VWX TRAVELS', {ts '2020-07-02 22:30:00'}, {ts '2020-07-03 03:00:00'}, 'CHENNAI', 'VILUPPURAM', 150);

COMMIT;