package com.juhnowski.proxy

import com.juhnowski.proxy.ProxyGrpc.*

import io.grpc.*
import io.grpc.stub.*
import io.rouz.grpc.*

import kotlin.coroutines.*
import kotlinx.coroutines.*
import kotlinx.coroutines.channels.*



@javax.annotation.Generated(
    value = ["by gRPC Kotlin generator"],
    comments = "Source: greeting.proto"
)
abstract class ProxyImplBase(
    coroutineContext: CoroutineContext = Dispatchers.Default
) : BindableService, CoroutineScope {

    private val _coroutineContext: CoroutineContext = coroutineContext

    override val coroutineContext: CoroutineContext
        get() = ContextCoroutineContextElement() + _coroutineContext

    
    
    
    open suspend fun proxy(request: com.juhnowski.proxy.MsgRequest): com.juhnowski.proxy.MsgReply {
        throw unimplemented(getProxyMethod()).asRuntimeException()
    }

    internal fun proxyInternal(
        request: com.juhnowski.proxy.MsgRequest,
        responseObserver: StreamObserver<com.juhnowski.proxy.MsgReply>
    ) {
        launch {
            tryCatchingStatus(responseObserver) {
                val response = proxy(request)
                onNext(response)
            }
        }
    }
    
    
    
    open suspend fun msgServerStream(request: com.juhnowski.proxy.MsgRequest): ReceiveChannel<com.juhnowski.proxy.MsgReply> {
        throw unimplemented(getMsgServerStreamMethod()).asRuntimeException()
    }

    internal fun msgServerStreamInternal(
        request: com.juhnowski.proxy.MsgRequest,
        responseObserver: StreamObserver<com.juhnowski.proxy.MsgReply>
    ) {
        launch {
            tryCatchingStatus(responseObserver) {
                val responses = msgServerStream(request)
                for (response in responses) {
                  onNext(response)
                }
            }
        }
    }
    
    
    
    open suspend fun msgClientStream(requests: ReceiveChannel<com.juhnowski.proxy.MsgRequest>): com.juhnowski.proxy.MsgReply {
        throw unimplemented(getMsgClientStreamMethod()).asRuntimeException()
    }

    internal fun msgClientStreamInternal(
        responseObserver: StreamObserver<com.juhnowski.proxy.MsgReply>
    ): StreamObserver<com.juhnowski.proxy.MsgRequest> {
        val requests = StreamObserverChannel<com.juhnowski.proxy.MsgRequest>()
        launch {
            tryCatchingStatus(responseObserver) {
                val response = msgClientStream(requests)
                onNext(response)
            }
        }
        return requests
    }
    
    
    
    open suspend fun msgBidirectional(requests: ReceiveChannel<com.juhnowski.proxy.MsgRequest>): ReceiveChannel<com.juhnowski.proxy.MsgReply> {
        throw unimplemented(getMsgBidirectionalMethod()).asRuntimeException()
    }

    internal fun msgBidirectionalInternal(
        responseObserver: StreamObserver<com.juhnowski.proxy.MsgReply>
    ): StreamObserver<com.juhnowski.proxy.MsgRequest> {
        val requests = StreamObserverChannel<com.juhnowski.proxy.MsgRequest>()
        launch {
            tryCatchingStatus(responseObserver) {
                val responses = msgBidirectional(requests)
                for (response in responses) {
                    onNext(response)
                }
            }
        }
        return requests
    }

    override fun bindService(): ServerServiceDefinition {
        return ServerServiceDefinition.builder(getServiceDescriptor())
            .addMethod(
                getProxyMethod(),
                ServerCalls.asyncUnaryCall(
                    MethodHandlers(METHODID_PROXY)
                )
            )
            .addMethod(
                getMsgServerStreamMethod(),
                ServerCalls.asyncServerStreamingCall(
                    MethodHandlers(METHODID_MSG_SERVER_STREAM)
                )
            )
            .addMethod(
                getMsgClientStreamMethod(),
                ServerCalls.asyncClientStreamingCall(
                    MethodHandlers(METHODID_MSG_CLIENT_STREAM)
                )
            )
            .addMethod(
                getMsgBidirectionalMethod(),
                ServerCalls.asyncBidiStreamingCall(
                    MethodHandlers(METHODID_MSG_BIDIRECTIONAL)
                )
            )
            .build()
    }

    private fun unimplemented(methodDescriptor: MethodDescriptor<*, *>): Status {
        return Status.UNIMPLEMENTED
            .withDescription("Method ${methodDescriptor.fullMethodName} is unimplemented")
    }

    private fun <E> handleException(t: Throwable?, responseObserver: StreamObserver<E>) {
        when (t) {
            null -> return
            is CancellationException -> handleException(t.cause, responseObserver)
            is StatusException, is StatusRuntimeException -> responseObserver.onError(t)
            is RuntimeException -> {
                responseObserver.onError(Status.UNKNOWN.asRuntimeException())
                throw t
            }
            is Exception -> {
                responseObserver.onError(Status.UNKNOWN.asException())
                throw t
            }
            else -> {
                responseObserver.onError(Status.INTERNAL.asException())
                throw t
            }
        }
    }

    private suspend fun <E> tryCatchingStatus(responseObserver: StreamObserver<E>, body: suspend StreamObserver<E>.() -> Unit) {
        try {
            responseObserver.body()
            responseObserver.onCompleted()
        } catch (t: Throwable) {
            handleException(t, responseObserver)
        }
    }

    private val METHODID_PROXY = 0
    private val METHODID_MSG_SERVER_STREAM = 1
    private val METHODID_MSG_CLIENT_STREAM = 2
    private val METHODID_MSG_BIDIRECTIONAL = 3

    private inner class MethodHandlers<Req, Resp> internal constructor(
        private val methodId: Int
    ) : ServerCalls.UnaryMethod<Req, Resp>,
        ServerCalls.ServerStreamingMethod<Req, Resp>,
        ServerCalls.ClientStreamingMethod<Req, Resp>,
        ServerCalls.BidiStreamingMethod<Req, Resp> {

        @Suppress("UNCHECKED_CAST")
        override fun invoke(request: Req, responseObserver: StreamObserver<Resp>) {
            when (methodId) {
                METHODID_PROXY ->
                    this@ProxyImplBase.proxyInternal(
                        request as com.juhnowski.proxy.MsgRequest,
                        responseObserver as StreamObserver<com.juhnowski.proxy.MsgReply>
                    )
                METHODID_MSG_SERVER_STREAM ->
                    this@ProxyImplBase.msgServerStreamInternal(
                        request as com.juhnowski.proxy.MsgRequest,
                        responseObserver as StreamObserver<com.juhnowski.proxy.MsgReply>
                    )
                else -> throw AssertionError()
            }
        }

        @Suppress("UNCHECKED_CAST")
        override fun invoke(responseObserver: StreamObserver<Resp>): StreamObserver<Req> {
            when (methodId) {
                METHODID_MSG_CLIENT_STREAM ->
                    return this@ProxyImplBase.msgClientStreamInternal(
                        responseObserver as StreamObserver<com.juhnowski.proxy.MsgReply>
                    ) as StreamObserver<Req>
                METHODID_MSG_BIDIRECTIONAL ->
                    return this@ProxyImplBase.msgBidirectionalInternal(
                        responseObserver as StreamObserver<com.juhnowski.proxy.MsgReply>
                    ) as StreamObserver<Req>
                else -> throw AssertionError()
            }
        }
    }
}
