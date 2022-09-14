package com.ivy.core.persistence.dummy.trn

import com.ivy.core.persistence.entity.trn.TrnLinkRecordEntity
import com.ivy.data.SyncState
import java.util.*

fun dummyTrnLinkRecordEntity(
    id: String = UUID.randomUUID().toString(),
    trnId: String = UUID.randomUUID().toString(),
    linkId: String = UUID.randomUUID().toString(),
    sync: SyncState = SyncState.Synced,
) = TrnLinkRecordEntity(
    id = id, trnId = trnId, linkId = linkId, sync = sync,
)