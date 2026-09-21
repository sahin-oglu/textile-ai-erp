package com.sahinoglu.purchase_order;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PurchaseOrderService {

	private final PurchaseOrderRepository purchaseOrderRepository;

	public PurchaseOrderService(PurchaseOrderRepository purchaseOrderRepository) {
		this.purchaseOrderRepository = purchaseOrderRepository;
	}

	public List<PurchaseOrderResponse> listPurchaseOrder() {
		return mapList(purchaseOrderRepository.findAll());

	}

	private PurchaseOrderResponse mapToResponse(PurchaseOrder purchaseOrder) {
		return new PurchaseOrderResponse();
	}

	private List<PurchaseOrderResponse> mapList(List<PurchaseOrder> orders) {

		List<PurchaseOrderResponse> responses = new ArrayList<>();

		for (PurchaseOrder p : orders) {
			responses.add(mapToResponse(p));
		}

		return responses;
	}
}
