create table price (
  id bigint not null auto_increment,
  price double precision not null,
  phone_id bigint,
  primary key (id),
   foreign key (phone_id) references phone (id)
)
