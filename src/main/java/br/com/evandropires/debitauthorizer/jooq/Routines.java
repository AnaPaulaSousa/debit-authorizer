/*
 * This file is generated by jOOQ.
 */
package br.com.evandropires.debitauthorizer.jooq;


import br.com.evandropires.debitauthorizer.jooq.routines.ComposeSessionReplicationRole;
import br.com.evandropires.debitauthorizer.jooq.routines.KillAllConnections;
import br.com.evandropires.debitauthorizer.jooq.routines.PgKillConnection;
import br.com.evandropires.debitauthorizer.jooq.routines.UpgradePostgis_23x;

import javax.annotation.Generated;

import org.jooq.Configuration;
import org.jooq.Field;


/**
 * Convenience access to all stored procedures and functions in public
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Routines {

    /**
     * Call <code>public.compose_session_replication_role</code>
     */
    public static String composeSessionReplicationRole(Configuration configuration, String role) {
        ComposeSessionReplicationRole f = new ComposeSessionReplicationRole();
        f.setRole(role);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * Get <code>public.compose_session_replication_role</code> as a field.
     */
    public static Field<String> composeSessionReplicationRole(String role) {
        ComposeSessionReplicationRole f = new ComposeSessionReplicationRole();
        f.setRole(role);

        return f.asField();
    }

    /**
     * Get <code>public.compose_session_replication_role</code> as a field.
     */
    public static Field<String> composeSessionReplicationRole(Field<String> role) {
        ComposeSessionReplicationRole f = new ComposeSessionReplicationRole();
        f.setRole(role);

        return f.asField();
    }

    /**
     * Call <code>public.kill_all_connections</code>
     */
    public static String killAllConnections(Configuration configuration) {
        KillAllConnections f = new KillAllConnections();

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * Get <code>public.kill_all_connections</code> as a field.
     */
    public static Field<String> killAllConnections() {
        KillAllConnections f = new KillAllConnections();

        return f.asField();
    }

    /**
     * Call <code>public.pg_kill_connection</code>
     */
    public static Boolean pgKillConnection(Configuration configuration, Integer __1) {
        PgKillConnection f = new PgKillConnection();
        f.set__1(__1);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * Get <code>public.pg_kill_connection</code> as a field.
     */
    public static Field<Boolean> pgKillConnection(Integer __1) {
        PgKillConnection f = new PgKillConnection();
        f.set__1(__1);

        return f.asField();
    }

    /**
     * Get <code>public.pg_kill_connection</code> as a field.
     */
    public static Field<Boolean> pgKillConnection(Field<Integer> __1) {
        PgKillConnection f = new PgKillConnection();
        f.set__1(__1);

        return f.asField();
    }

    /**
     * Call <code>public.upgrade_postgis_23x</code>
     */
    public static void upgradePostgis_23x(Configuration configuration) {
        UpgradePostgis_23x p = new UpgradePostgis_23x();

        p.execute(configuration);
    }
}