-- admin123 (koen, elwyn)
-- user123 (piet, sara, willem, bas)
-- member123 (klaas, noor, lisa, robert, anouk, jamie, peter, kelly)

INSERT INTO users(username, password, enabled)
VALUES ('koen', '$2a$10$X8iI32YbVcYZUn7Yt43lN.r5RLxIdsifR.Ghtmm1NDhzS3vOGPYPC', TRUE),
       ('elwyn', '$2a$10$X8iI32YbVcYZUn7Yt43lN.r5RLxIdsifR.Ghtmm1NDhzS3vOGPYPC', TRUE),
       ('piet', '$2a$10$Ek5/6q92poJ8QttyoI1i0OYx7DVQw/DPHFBKPgNxMKerChHFDlt0S', TRUE),
       ('sara', '$2a$10$Ek5/6q92poJ8QttyoI1i0OYx7DVQw/DPHFBKPgNxMKerChHFDlt0S', TRUE),
       ('willem', '$2a$10$Ek5/6q92poJ8QttyoI1i0OYx7DVQw/DPHFBKPgNxMKerChHFDlt0S', TRUE),
       ('bas', '$2a$10$Ek5/6q92poJ8QttyoI1i0OYx7DVQw/DPHFBKPgNxMKerChHFDlt0S', TRUE),
       ('klaas', '$2a$10$dc80/JpPTHFg0/xCUc4pDeqvTvGOGHlAckWXiJVU6pFZxuUTXOdAy', TRUE),
       ('noor', '$2a$10$dc80/JpPTHFg0/xCUc4pDeqvTvGOGHlAckWXiJVU6pFZxuUTXOdAy', TRUE),
       ('lisa', '$2a$10$dc80/JpPTHFg0/xCUc4pDeqvTvGOGHlAckWXiJVU6pFZxuUTXOdAy', TRUE),
       ('robert', '$2a$10$dc80/JpPTHFg0/xCUc4pDeqvTvGOGHlAckWXiJVU6pFZxuUTXOdAy', TRUE),
       ('anouk', '$2a$10$dc80/JpPTHFg0/xCUc4pDeqvTvGOGHlAckWXiJVU6pFZxuUTXOdAy', TRUE),
       ('jamie', '$2a$10$dc80/JpPTHFg0/xCUc4pDeqvTvGOGHlAckWXiJVU6pFZxuUTXOdAy', TRUE),
       ('peter', '$2a$10$dc80/JpPTHFg0/xCUc4pDeqvTvGOGHlAckWXiJVU6pFZxuUTXOdAy', TRUE),
       ('kelly', '$2a$10$dc80/JpPTHFg0/xCUc4pDeqvTvGOGHlAckWXiJVU6pFZxuUTXOdAy', TRUE);

INSERT INTO authorities (username, authority)
VALUES ('koen', 'ROLE_USER'),
       ('koen', 'ROLE_MEMBER'),
       ('koen', 'ROLE_ADMIN'),
       ('elwyn', 'ROLE_USER'),
       ('elwyn', 'ROLE_MEMBER'),
       ('elwyn', 'ROLE_ADMIN'),
       ('piet', 'ROLE_USER'),
       ('sara', 'ROLE_USER'),
       ('willem', 'ROLE_USER'),
       ('bas', 'ROLE_USER'),
       ('klaas', 'ROLE_USER'),
       ('klaas', 'ROLE_MEMBER'),
       ('noor', 'ROLE_USER'),
       ('noor', 'ROLE_MEMBER'),
       ('lisa', 'ROLE_USER'),
       ('lisa', 'ROLE_MEMBER'),
       ('robert', 'ROLE_USER'),
       ('robert', 'ROLE_MEMBER'),
       ('anouk', 'ROLE_USER'),
       ('anouk', 'ROLE_MEMBER'),
       ('jamie', 'ROLE_USER'),
       ('jamie', 'ROLE_MEMBER'),
       ('peter', 'ROLE_USER'),
       ('peter', 'ROLE_MEMBER'),
       ('kelly', 'ROLE_USER'),
       ('kelly', 'ROLE_MEMBER');

