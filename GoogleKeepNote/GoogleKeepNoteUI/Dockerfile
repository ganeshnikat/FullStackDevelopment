FROM node:8.9.4
RUN mkdir /usr/src/app
WORKDIR /usr/src/app
RUN npm install -g @angular/cli@1.7.1
COPY . /usr/src/app
CMD ng serve --host 0.0.0.0 --port 4200
EXPOSE 4200