FROM nginx:alpine


ADD https://github.com/kelseyhightower/confd/releases/download/v0.10.0/confd-0.10.0-linux-amd64 /usr/local/bin/confd

ADD startup.sh /startup.sh
ADD confd /etc/confd
ENV PROXY_URL http://localhost:8080
RUN touch /var/run/nginx.pid && \
  chown -R nginx:nginx /var/run/nginx.pid && \
  chown -R nginx:nginx /var/cache/nginx && \
  chown -R nginx:nginx /var/log/nginx && \
  chown -R nginx:nginx /usr/local/bin/confd && \
  chown -R nginx:nginx  /startup.sh  && \
  chown -R nginx:nginx /etc/nginx && \
  chown -R nginx:nginx /etc/confd



COPY dist/ .
RUN rm /etc/nginx/nginx.conf && chmod +x /startup.sh  && chmod +x /usr/local/bin/confd
USER nginx
ENTRYPOINT sh /startup.sh