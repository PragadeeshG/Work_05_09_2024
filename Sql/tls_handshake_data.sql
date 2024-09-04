create table if not exists tls_handshake_data(
secure_socker_cipher_file_name Integer not null,
secure_socker_cipher_password Integer null,
server_root varchar(255) null,
server_inter Integer null,
tls_layers varchar(255) null,
ssl_record_protocol varchar(255) null,
handshake_protocol varchar(255) null,
change_cipher_spec varchar(255) null,
alert_protocol varchar(255) null,
validity varchar(255) null,
remarks varchar(255) null,
constraint tls_handshake_data_pk primary key(secure_socker_cipher_file_name));