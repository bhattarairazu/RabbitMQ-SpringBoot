# RabbitMQ-SpringBoot
Project of RabbitMQ implementation with Spring Boot

##### To Run this Project at first Install RabbitMq on your Machine or use docker to pull latest images of rabbit mq from docker hub

Use `docker pull rabbitmq:3-management` in your command line.Make sure you have installed docker in your machine.If not you can install it from [here](https://www.digitalocean.com/community/tutorials/how-to-install-and-use-docker-on-ubuntu-20-04)


After pulling latest image from docker type command: 
 >docker run --rm -it --hostname my-rabbit -p 15672:15672 -p 5672:5672 rabbitmq:3-management

Thats it ,RabbitMQ is successfully launced you can visit it using [localhost:15672](http://localhost:15672)

Now,Run you SpringBoot Project.

And Enjoy!!!
