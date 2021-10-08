FROM docker:19.03.6-dind

FROM jenkins/jenkins:2.289.3

# Add Jenkins init files
COPY src/ /usr/share/jenkins/ref/

COPY --chown=jenkins:jenkins plugins.txt /usr/share/jenkins/ref/plugins.txt
RUN /usr/local/bin/install-plugins.sh < /usr/share/jenkins/ref/plugins.txt
COPY --from=docker:19.03.6-dind /usr/local/bin/docker /usr/local/bin/

USER root

RUN apt-get update && \
    apt-get install -qy \
    -o APT::Install-Recommend=false -o APT::Install-Suggests=false \
    python3-venv

COPY build/requirements.txt /build/

RUN python3 -m venv /appenv && \
    . /appenv/bin/activate && \
    pip install pip --upgrade && \
    pip install -r /build/requirements.txt

USER jenkins