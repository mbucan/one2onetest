-- begin ONE2ONETEST_PERSON
create table ONE2ONETEST_PERSON (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    SURNAME varchar(255),
    DATEOFBIRTH date,
    PASSPORT_ID varchar(36),
    --
    primary key (ID)
)^
-- end ONE2ONETEST_PERSON
-- begin ONE2ONETEST_PASSPORT
create table ONE2ONETEST_PASSPORT (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    PASSPORT_NUMBER varchar(255),
    PASSPORT_ISSUE_DATE date,
    PASSPORT_EXPIRY_DATE date,
    --
    primary key (ID)
)^
-- end ONE2ONETEST_PASSPORT
