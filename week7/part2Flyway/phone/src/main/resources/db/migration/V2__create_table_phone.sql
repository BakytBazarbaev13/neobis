create table phone (
  id bigint not null auto_increment,
  color varchar(255),
  memory integer not null,
  name varchar(255),
  ram integer not null,
  year_of_issue date,
  brand_id bigint,
  primary key (id),
  foreign key (brand_id) references brand (id)
)
