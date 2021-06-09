-- begin MTTEST_STORE
create table MTTEST_STORE (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CODE varchar(30) not null,
    NAME varchar(100) not null,
    TENANT_ID varchar(255),
    --
    primary key (ID)
)^
-- end MTTEST_STORE
