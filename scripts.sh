#!/bin/bash
sudo systemctl restart httpd || (sudo yum install -y httpd && sudo systemctl start httpd)
