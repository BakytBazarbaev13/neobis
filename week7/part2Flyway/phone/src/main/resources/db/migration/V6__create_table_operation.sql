create table operation (
  id bigint not null auto_increment,
  date_sale date,
  client_id bigint,
  employees_id bigint,
  phone_id bigint,
  primary key (id),
  foreign key (client_id) references client (id),
  foreign key (employees_id) references employees (id),
  foreign key (phone_id) references phone (id)
)