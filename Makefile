install:
	mvn install

start:
	mvn spring-boot:run

db:
	docker compose -f docker/docker-compose.yml up -d
