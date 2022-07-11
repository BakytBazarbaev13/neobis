create table client (
  id bigint not null auto_increment,
  address varchar(255),
  name varchar(255),
  phone_number varchar(255),
  primary key (id)
)