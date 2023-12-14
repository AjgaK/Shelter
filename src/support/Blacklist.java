package support;

import java.util.HashMap;
import java.util.Map;

import user_related.Customer;

public class Blacklist {
	private static Map<Long, Reason> blacklistMap;

	public Blacklist() {
		Blacklist.blacklistMap = new HashMap<>();
	}

	public static String showBlacklist() {
		String message;
		if (blacklistMap.isEmpty()) {
			message = "Blacklist is empty.";
		} else {
			StringBuilder sb = new StringBuilder("Blacklist:\n");
			for (Map.Entry<Long, Reason> entry : blacklistMap.entrySet()) {
				long customerID = entry.getKey();
				Reason reason = entry.getValue();
				sb.append("Customer ID: ").append(customerID).append("\nReason: ").append(reason.getDescription())
						.append("\n------\n");
			}
			message = sb.toString();
		}
		System.out.println(message);
		return message;
	}

	public void fillBlacklistFile(Customer customer, Reason reason) {
		long customerID = customer.getCustomerID();
		blacklistMap.put(customerID, reason);
	}

	public void removeFromBlacklist(Customer customer) {
		long customerID = customer.getCustomerID();
		blacklistMap.remove(customerID);
	}

	public static boolean isCustomerBlacklisted(long customerID) {
		return blacklistMap.containsKey(customerID);
	}
}