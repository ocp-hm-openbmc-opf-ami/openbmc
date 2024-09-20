FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI:append = " \
    file://journald-size-policy-10MB.conf \
    file://journald-storage-policy.conf \
    file://systemd-networkd-only-wait-for-one.conf \
"

do_install:append() {

    install -m 644 -D \
        ${WORKDIR}/journald-size-policy-10MB.conf \
        ${D}${systemd_unitdir}/journald.conf.d/journald-size-policy-10MB.conf

    install -m 644 -D \
        ${WORKDIR}/journald-storage-policy.conf \
        ${D}/${systemd_unitdir}/journald.conf.d/journald-storage-policy.conf

    install -m 644 -D \
        ${WORKDIR}/systemd-networkd-only-wait-for-one.conf \
        ${D}${systemd_system_unitdir}/systemd-networkd-wait-online.service.d/systemd-networkd-only-wait-for-one.conf

}
