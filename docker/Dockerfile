#FROM jboss/wildfly:9.0.2.Final
FROM registry.access.redhat.com/jboss-eap-6/eap64-openshift
ENV postgres_module_dir=/opt/eap/modules/org/postgresql/main/

RUN mkdir -p ${postgres_module_dir}
ADD module.xml ${postgres_module_dir}
ADD postgresql-9.4-1201.jdbc41.jar ${postgres_module_dir}

ENV config_dir=/opt/eap/standalone/configuration/

ADD standalone.xml ${config_dir}
ADD maven/*.war /opt/eap/standalone/deployments/

USER root
RUN chown -R jboss:jboss ${postgres_module_dir}/*
USER jboss

EXPOSE 8787

RUN /opt/eap/bin/add-user.sh admin v13wp01nt* --silent
CMD ["/opt/eap/bin/standalone.sh", "-b", "0.0.0.0", "-bmanagement", "0.0.0.0"]
