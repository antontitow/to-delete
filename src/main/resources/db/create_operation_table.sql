create table if not exists operation(
id UUID default gen_random_uuid() primary key
);

create table if not exists debit_operation(
id UUID default gen_random_uuid() primary key
);

create table if not exists credit_operation(
id UUID default gen_random_uuid() primary key
);