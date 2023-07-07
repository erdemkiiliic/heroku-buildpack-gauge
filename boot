#!/usr/bin/env bash

# This script is executed during the runtime phase on Heroku.
# It is responsible for launching the Gauge test runner.

# Print all executed commands
set -e

# Set the Gauge binary path
export PATH="$PATH:$HOME/.gauge"

# Change to the application directory
cd /app