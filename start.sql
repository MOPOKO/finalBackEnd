create sequence customer_seq start 1 increment 1;

create table customers (id int8 not null, first_name varchar(255), last_name varchar(255), email_address varchar(255), job_title varchar(255), mobile_phone varchar(255), city varchar(255), web_page varchar(255));

insert into customers values (145, 'Nurdin', 'Imanaliev', 'nurdin.imanaliev@iaau.edu.kg', 'programmer', '0312342323', 'Bishkek', 'nurdin.com');
insert into customers values (146, 'Nurlan', 'Shaidullaev', 'nurdin.imanaliev@iaau.edu.kg', 'programmer', '0312342323', 'Bishkek', 'nurdin.com');
insert into customers values (147, 'Burul', 'Shambetova', 'nurdin.imanaliev@iaau.edu.kg', 'programmer', '0312342323', 'Bishkek', 'nurdin.com');
insert into customers values (148, 'Omer', 'Gurbus', 'nurdin.imanaliev@iaau.edu.kg', 'programmer', '0312342323', 'Bishkek', 'nurdin.com');
