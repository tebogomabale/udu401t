create table ATM
(
	CARD_ID INTEGER not null primary key,
	CARD_HOLDER_NAME VARCHAR(250),
	BANK_NAME VARCHAR(250),
	CARD_NUMBER NUMERIC not null,
	BALANCE NUMERIC not null,
	TRANSACTIONAMOUNT NUMERIC not null,
	TRANSACTIONTYPE VARCHAR(250),
	PIN_NUMBER NUMERIC not null,
	CVV_NUMBER NUMERIC not null		
);


