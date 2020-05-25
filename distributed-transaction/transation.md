##ACID
```text
Atomicity（原子性）: 保证事务内，要么同时成功，要么同时失败
Consistency(一致性)：
Isolation(隔离性)：
Durability(持久性)：
```

##事务的隔离级别
```text
READ-UNCOMMITTED
READ-COMMITTED 
READ_REPEATABLE
SERIAIZABLE
```

##事务实践
###SQL 事务
```text
MYSQL SQL开启事务方式

START TRANSATION;
UPDATE 1;
UPDATE 2;
COMMIT;
--ROLLBACK
```
