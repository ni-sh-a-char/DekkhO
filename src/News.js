import React from 'react';

export default function News({ article }) {
  return (
    <div className="news">
      <h2>{article.title}</h2>
      <p>{article.description}</p>
      <a href={article.url} target="_blank" rel="noopener noreferrer">Read more</a>
    </div>
  );
}
