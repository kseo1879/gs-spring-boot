FROM node:16 as build
WORKDIR /
COPY package*.json ./
RUN yarn install
COPY . .
ENTRYPOINT ["yarn","serve","port","3000"]
EXPOSE 3000
