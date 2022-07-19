INSERT INTO tb_users (email, password) VALUES ('demo@errrad.io',crypt('cjaiU8CV', gen_salt('bf')));
COMMIT;
