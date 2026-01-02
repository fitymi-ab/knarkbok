#!/usr/bin/env bash

  if ./build.sh; then
    git fetch
    git rebase
    git push
  fi