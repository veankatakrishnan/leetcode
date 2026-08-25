SELECT v.customer_id, COUNT(v.visit_id) as count_no_trans
FROM Visits V
LEFT JOIN Transactions t ON v.visit_id = t.visit_id
WHERE t.transaction_id is null
GROUP BY customer_id;