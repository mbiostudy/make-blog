.PHONY:	build-SNAPSHOT build-prod push-SNAPSHOT push-prod rm

PREFIX = mbiostudyregistry.azurecr.io
IMAGE = make-blog-front
TAG = 1.0

build-SNAPSHOT:
	docker build -t $(PREFIX)/$(IMAGE):$(TAG)-SNAPSHOT .

build-prod:
	docker build -t $(PREFIX)/$(IMAGE):$(TAG) .

rm:
	docker rm -f make-build-front

push-prod:
	docker push $(PREFIX)/$(IMAGE):$(TAG)

push-SNAPSHOT:
	docker push $(PREFIX)/$(IMAGE):$(TAG)-SNAPSHOT