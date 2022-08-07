INSERT INTO tb_users (email, password) VALUES ('demo@financialhouse.io',crypt('cjaiU8CV', gen_salt('bf')));
COMMIT;
