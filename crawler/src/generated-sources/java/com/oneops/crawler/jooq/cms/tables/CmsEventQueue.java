/*
 * This file is generated by jOOQ.
*/
package com.oneops.crawler.jooq.cms.tables;


import com.oneops.crawler.jooq.cms.Indexes;
import com.oneops.crawler.jooq.cms.Keys;
import com.oneops.crawler.jooq.cms.Kloopzcm;
import com.oneops.crawler.jooq.cms.tables.records.CmsEventQueueRecord;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CmsEventQueue extends TableImpl<CmsEventQueueRecord> {

    private static final long serialVersionUID = 1483337714;

    /**
     * The reference instance of <code>kloopzcm.cms_event_queue</code>
     */
    public static final CmsEventQueue CMS_EVENT_QUEUE = new CmsEventQueue();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CmsEventQueueRecord> getRecordType() {
        return CmsEventQueueRecord.class;
    }

    /**
     * The column <code>kloopzcm.cms_event_queue.event_id</code>.
     */
    public final TableField<CmsEventQueueRecord, Long> EVENT_ID = createField("event_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>kloopzcm.cms_event_queue.source_pk</code>.
     */
    public final TableField<CmsEventQueueRecord, Long> SOURCE_PK = createField("source_pk", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>kloopzcm.cms_event_queue.source_name</code>.
     */
    public final TableField<CmsEventQueueRecord, String> SOURCE_NAME = createField("source_name", org.jooq.impl.SQLDataType.VARCHAR(200).nullable(false), this, "");

    /**
     * The column <code>kloopzcm.cms_event_queue.event_type_id</code>.
     */
    public final TableField<CmsEventQueueRecord, Integer> EVENT_TYPE_ID = createField("event_type_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>kloopzcm.cms_event_queue.created</code>.
     */
    public final TableField<CmsEventQueueRecord, Timestamp> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>kloopzcm.cms_event_queue</code> table reference
     */
    public CmsEventQueue() {
        this(DSL.name("cms_event_queue"), null);
    }

    /**
     * Create an aliased <code>kloopzcm.cms_event_queue</code> table reference
     */
    public CmsEventQueue(String alias) {
        this(DSL.name(alias), CMS_EVENT_QUEUE);
    }

    /**
     * Create an aliased <code>kloopzcm.cms_event_queue</code> table reference
     */
    public CmsEventQueue(Name alias) {
        this(alias, CMS_EVENT_QUEUE);
    }

    private CmsEventQueue(Name alias, Table<CmsEventQueueRecord> aliased) {
        this(alias, aliased, null);
    }

    private CmsEventQueue(Name alias, Table<CmsEventQueueRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Kloopzcm.KLOOPZCM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.CMS_EVENT_QUEUE_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<CmsEventQueueRecord> getPrimaryKey() {
        return Keys.CMS_EVENT_QUEUE_PK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<CmsEventQueueRecord>> getKeys() {
        return Arrays.<UniqueKey<CmsEventQueueRecord>>asList(Keys.CMS_EVENT_QUEUE_PK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<CmsEventQueueRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<CmsEventQueueRecord, ?>>asList(Keys.CMS_EVENT_QUEUE__CMS_EVENT_QUEUE_ETID_FK);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CmsEventQueue as(String alias) {
        return new CmsEventQueue(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CmsEventQueue as(Name alias) {
        return new CmsEventQueue(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CmsEventQueue rename(String name) {
        return new CmsEventQueue(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CmsEventQueue rename(Name name) {
        return new CmsEventQueue(name, null);
    }
}
