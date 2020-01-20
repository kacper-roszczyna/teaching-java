create table adder_log(
    id bigint primary key,
    arg1 bigint not null,
    arg2 bigint not null,
    created_at timestamp not null
);

create sequence adder_log_id_seq;