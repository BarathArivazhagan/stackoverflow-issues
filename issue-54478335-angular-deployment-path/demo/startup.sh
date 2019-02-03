#!/bin/bash
echo "Start process"

export PROXY_URL=${PROXY_URL}



# ensure the following environment variables are set. exit script and container if not set.
# test $backend_host

/usr/local/bin/confd -onetime -backend env
chown -R nginx:nginx /etc/nginx/nginx.conf
echo "Starting Nginx"
exec /usr/sbin/nginx -g 'daemon off;'