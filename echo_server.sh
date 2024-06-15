#!/usr/bin/env bash

# {"src":"c0","dest":"n0","body":{"type":"echo","msg_id":1,"echo":"itsa me"}}
(
  cd `dirname $0`
  clj -m echo-server
)
