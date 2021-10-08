#!/bin/bash
. /appenv/bin/activate
# Handoff to application as Jenkins user
exec "$@"