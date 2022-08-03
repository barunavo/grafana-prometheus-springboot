# spring-boot-prometheus-grafana

This is a sample for monitoring spring boot web application by using [Prometheus](https://prometheus.io/) and [Grafana](https://grafana.com/).

## How to run

You must intall [docker](https://www.docker.com/), and use docker-compose command.

Run application as follows.

```bash
$ git clone 
$ cd spring-boot-prometheus-grafana
$ make build && make up
``` 

Three applications are going to start.
(Spring boot web application takes a little time to start up.)

| Application | URL |
|-------------|------|
|spring boot web application | http://localhost:8080 |
|Prometheus | http://localhost:9090 |
|Grafana | http://localhost:3000 or http://localhost:8080/grafana |

Prometheus monitors spring boot application.
Grafana visualizes prometheus data source.

# Set up Grafana's data source

You can login to Grafana by `admin/foobar`.
You set up prometheus data source as follows.

|item| value |
|---|-----|
|Type|Prometheus|
|URL|http://localhost:9090|
|Access|direct|
|Scrap interval|5s|


# Spring boot web application's API

|item| value |
|---|-----|
|`/prometheus`| Display metrics for prometheus. |
|`/`| Return `hello from Barunavo`. |

