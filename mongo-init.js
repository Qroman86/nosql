db = db.getSiblingDB('netologydb');

db.createUser({
    user: "netology",
    pwd: "netology123",
    roles: [
        { role: "readWrite", db: "netologydb" }
    ]
});