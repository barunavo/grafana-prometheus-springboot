.PHONY: build up start down destroy stop restart logs logs-web ps login-web login-prometheus login-grafana 


build:    
	docker-compose -f docker-compose.yml build $(c)

up:
	docker-compose -f docker-compose.yml up -d $(c)

start:
	docker-compose -f docker-compose.yml start $(c)

down:
	docker-compose -f docker-compose.yml down $(c)

destroy:
	docker-compose -f docker-compose.yml down -v $(c)

stop:
	docker-compose -f docker-compose.yml stop $(c)

restart:
	docker-compose -f docker-compose.yml stop $(c)
	docker-compose -f docker-compose.yml build $(c)
	docker-compose -f docker-compose.yml up -d $(c)

logs:
	docker-compose -f docker-compose.yml logs --tail=100 -f $(c)

logs-web:
	docker-compose -f docker-compose.yml logs --tail=100 -f web

ps:
	docker-compose -f docker-compose.yml ps

login-web:
	docker-compose -f docker-compose.yml exec web /bin/bash

login-prometheus:
	docker-compose -f docker-compose.yml exec prometheus /bin/bash

login-grafana:
	docker-compose -f docker-compose.yml exec prometheus /bin/bash
